import processing.core.PApplet;
public class TryProcessing extends PApplet{
	public static final int WIDTH=640;
	public static final int HEIGHT=400;
	public static final int DIAMETER=10;
	int x=0;
	
	public static void main(String[] args){PApplet.main("TryProcessing",args);}
	
	@Override
	public void setting(){
	super.setting();
	size(WIDTH,HEIGHT);}
	
	@Override
	public void setup(){}
	
	@Override
	public void draw(){
	paintWhite();
	drawCircle1();
	drawCircle2();
	drawCircle3();
	drawCircle4();}
	
	private void drawCircle1(){
	ellipse(x,HEIGHT/5,DIAMETER,DIAMETER);
	x++;}
	
	private void drawCircle2(){
	ellipse(x,HEIGHT2/5,DIAMETER,DIAMETER);
	x+=2;}
	
	private void drawCircle3(){
	ellipse(x,HEIGHT3/5,DIAMETER,DIAMETER);
	x+=3;}
	
	private void drawCircle4(){
	ellipse(x,HEIGHT4/5,DIAMETER,DIAMETER);
	x+=4;}
	
	private void paintWhite(){
	background(255);}
	
	}
