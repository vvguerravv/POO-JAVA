public class Ex2 {
    public static void main(String args[]){
        double CF = 0;
        int projeto1 = 0, projeto2=0;
        int participacao = 0 ;

        for(int i = 1; i < args.length;i++){
            if(i == 1){
                projeto1 = Integer.parseInt(args[i]);
            } else if(i == 2){
                projeto2 = Integer.parseInt(args[i]);
            } else{
                participacao = Integer.parseInt(args[i]);
            }
        }

        CF = (((projeto1*2 + projeto2*3))/5) * 0.9 + participacao * 0.1;

        System.out.println(Math.round(CF));
    }

}