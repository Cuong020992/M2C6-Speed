public class MovePoint {
    private float x = 0.0f;
    private float y = 0.0f;

    public MovePoint(){

    }

    public MovePoint(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] a = {x,y};
        return a;
    }

    @Override
    public String toString() {
        return "MovePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
