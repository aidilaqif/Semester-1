public class randomNumber {
    public static void main(String args[]){
        int[] num = new int[200];
        int integer;
        int zero=0,one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;
        for(int i =1;i<=num.length;i++){
            integer=(int)(Math.random()*10);
            switch (integer){
                case 0:
                    zero++;
                    break;
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4: 
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
                case 7:
                    seven++;
                    break;
                case 8:
                    eight++;
                    break;
                case 9:
                    nine++;
                    break;
                
            }
        }
        System.out.println("The counter for number 0-9: ");
        System.out.println("0 = "+zero+"\n1 = "+one+"\n2 = "+two+"\n3 = "+three+"\n4 = "+four+"\n5 = "+five+"\n6 = "+six+"\n7 = "+seven+"\n8 = "+eight+"\n9 = "+nine);
    }    
}
