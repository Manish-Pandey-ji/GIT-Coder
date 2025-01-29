/bin/bash: line 1: wq: command not found
    public static void main(String[] args) {
        int a = 5;

        pattern_one(a);
        System.out.println();
        pattern_2(a);
        System.out.println();
        pattern_3(a);
        System.out.println();
    }

    static void pattern_one(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void pattern_2(int n) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern_3(int n) {
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<= n-i+1 ; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}

