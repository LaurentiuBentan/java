public class While {
    public static void main(String[] args) {
        int dalmatieni = 1;
        //dalmatianul nr 7 = pogo; dalmatianul nr 9 = perdita
        while (dalmatieni >0 && dalmatieni <=101) {

            if (dalmatieni == 7 || dalmatieni == 9){
                dalmatieni++;
               continue;
            }
            System.out.println("dalmatianul cu numarul: "+ dalmatieni);
            dalmatieni++; //incrementam contorul

        }

        while (dalmatieni >0 && dalmatieni <=101) {

            if (dalmatieni == 7 || dalmatieni == 9){
                System.out.println("am gasit dalmatianul adult");
                break;
            }
            System.out.println("dalmatianul cu numarul: "+ dalmatieni);
            dalmatieni++; //incrementam contorul

        }

    }
}
