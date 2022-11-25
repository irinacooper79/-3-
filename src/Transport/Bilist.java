package Transport;

public class Bilist{
    public static void main (String[] args)
    {printList();}

    public static void printList(){
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i=0; i<8; i++){

            biDemArrList.add(i, new ArrayList<>());
            for (int j=0; j<8; j++){

                Object element;
                if ((i % 2 == 0 && j % 2 > 0) || (i % 2 > 0 && J % 2 == 0)){

                    biDemArrList.get(i).add(j, element: "0");

                } else {

                    biDemArrList.get(i).add ( j, element: "0");
                }
            }
        }
        for ( int i=0; i < 8; i ++){
            for ( int j=0; j < 8; j ++){

                System.out.printf (biDemArrList.get (i).get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}