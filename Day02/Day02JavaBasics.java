class Day02JavaBasics{
    public static void greet(){
            System.out.println("Hello");
        }
    public static void greet(String name){
        System.out.println("Hello "+name);
    }

    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            System.out.print(i+" ");
        }

        for(int j=100;j>=1;j--){
            System.out.print(j+" ");
        }

        for(int i=0;i<=20;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }


        int sum =0;
        for(int i=0;i<=10;i++){
            sum+=i;
        }
        System.out.print(sum);



        

        greet();
        greet("Nandha");


        int added = add(5,9);
        System.out.print(added);
    }
}