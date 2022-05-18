//Map implementation
Array.prototype.mymap = function(callback) {
    const resultArray = [];
    for (let index = 0; index < this.length; index++) {
        resultArray.push(callback(this[index], index, this));
    }
    return resultArray;
}

//Filter implementation
Array.prototype.myFilter = function(callback) {
    const filterArr = [];
    for(let index = 0; index<this.length; index++) {
        if(!!callback(this[index], index, this)) {
            filterArr.push(this[index]);
        }
    }
    return filterArr;
}

//Reduce implementation
Array.prototype.myReduce = function(callback, accumulator) {
    if(this.length < 1) {
        throw new Error("Array is Empty")
    }

    if(!accumulator) {
        if(typeof this[0] === "string") {
            accumulator = '';
        } else if(typeof this[0] === "number") {
            accumulator = 0;
        }
    }

    for(let index=0; index < this.length; index++) {
        accumulator = callback(accumulator, this[index]);
    }
    return accumulator;
}

//Foreach implementation.
Array.prototype.myEach = function myEach(callback) {
  for (let i = 0; i < this.length; i += 1) {
    if (this.hasOwnProperty(i)) {
      callback(this[i], i, this);
    }
  }
}


const arr = [1, 'ashok', 3, 4]
// let's delete one of the elements
delete arr[1];




const names = ['Zakir', 'Rashid', 'Harish'];
const filterNames = names.myFilter(name => name !== 'Zakir');
const statment = names.myReduce((acc, ele) => acc + ele);

console.log(filterNames) // [ 'Rashid', 'Harish' ]
console.log(statment); // Zakir Rashid Harish
arr.myEach(el => console.log(el));//[1 3 4 "____"]