public class task2 {

    public static void main(String[] args) {

        String names [] = new String []{"Даша","Таня","Коля","Вова","Ира"};
        int age [] = new int []{26, 30, 18, 5,16};
        int i = 0;
        while (i < names.length){
            String str = names [i];
            String newstr = str.substring(0, str.length()-1);
            if (age[i] > 25) {
                System.out.println(newstr+"е" + ",к сожалению, уже " + age [i]+ " лет.");
            }
            else {
                System.out.println(newstr+"е " + "всего " + age [i]+" лет.");
            }
            i++;
        }

        for (i = 0; i < age.length; i++){
            String str = names [i];
            String newstr = str.substring(0, str.length()-1);
            if (age[i] > 25) {
                System.out.println(newstr+"е" + ",к сожалению, уже " + age [i]+ " лет.");
            }
            else {
                System.out.println(newstr+"е " + "всего " + age [i]+" лет.");
            }
        }
    }
}
