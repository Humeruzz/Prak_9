import java.util.Arrays;

public class DataBase {
    private Person[] db;

    public DataBase(int num) {
        db = new Person[num];
        for (int i =0; i< num; i++){
            db[i] = new Person("Name"+(i+1),""+((i+1)*3));
            //db[i] = new Person("Name2","6");
        }
    }

    public Person getPerson(int num){
        return db[num];
    }

    public boolean checkPerson(Person obj) throws Exception {
        for (int i = 0; i < db.length; i++){
            if(obj.getId() == db[i].getId()) {
                return true;
            }
        }
        throw new Exception("PersonNotFoundException");
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "db=" + Arrays.toString(db) +
                '}';
    }
}
