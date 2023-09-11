class Quadratic {
    public static void main(String[] args) {
        // Write your code here

        var scanner = new java.util.Scanner(System.in);

        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var c = scanner.nextDouble();
        

        scanner.close();

        var d = (b*b + ((-4) * a * c));

  if(a == 0){
                if(b == 0){
                    if(c == 0){
                        System.out.println("Infinitely many roots");
                    }
                    else{
                        System.out.println("No roots");
                }
            }

                        else{
                            var root = (-1*c) / b;
                                System.out.println(root);
                        }} else{

        if(d > 0){
                System.out.println(((-b) + Math.sqrt(d))/(2 * a) + " " + ((-b) - Math.sqrt(d))/(2 * a));
            } else{
            if(d==0){
          System.out.println((-b)/(2 * a));    
            } else{
                if(d<0)
                System.out.println("No roots" );
            } 
        }
    }
  
}}
