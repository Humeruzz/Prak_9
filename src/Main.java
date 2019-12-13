public class Main {

    public static void main(String[] args) {
        DataBase obj = new DataBase(10);
        System.out.println(obj);
        try{
            DataBase temp = new DataBase(10);
            System.out.println(temp);
            System.out.println(temp.getPerson(1));
            Person temp1 = obj.getPerson(1);
            System.out.println(temp1);
            if (temp.getPerson(1) == temp1){
                System.out.println("Same");
            }
            if(obj.checkPerson(/*obj.getPerson(0)*/temp1)){
                System.out.println("Found");
            }
        } catch (Exception e){
            //System.out.println("Not Found");
            System.out.println(e);
        }
    }
}
