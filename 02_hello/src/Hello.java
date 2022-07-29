class Hello {
    public static void main(String[] args) {
        int customerType = 0;
        int point = 0;
        switch(customerType) {
        case 0:
            point += 1000;
            System.out.println("##### 0 #####");
            //break;
        case 1:
            point += 500;
            System.out.println("##### 1 #####");
            //break;
        case 2:
            point += 200;
            System.out.println("##### 2 #####");
            //break;
        }
    }
}