class Triangle {
    
    float height;
    float base;

    //Default constructor
    Triangle(){
        height  = 10.0f;
        base = 20.0f;

    }

    //Parameterized
    Triangle(float b, float h){
        this.height = h;
        this.base = b;
    }

    //Copy
    Triangle(Triangle object){

        this.base = object.base;
        this.height = object.height;
    }

    private float area(){

        return 0.5f*this.base*this.height;
    }

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(20, 30);
        Triangle triangle3 = triangle2;

        System.out.println(triangle1.area());
        System.out.println(triangle2.area());
        System.out.println(triangle3.area());
    }
}
