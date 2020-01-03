import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Rakin
 *
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> keyList=new ArrayList<>(Arrays.asList("auto","break","case",
        		"char","const","continue","default","do","double",
        		"else","float","for","if","int","long",
        		"return","short","signed","static","while"));
        ArrayList<String> OprList=new ArrayList<>(Arrays.asList("+","*","/","-","%","&","!","="));
        ArrayList<String> IdntList=new ArrayList<>(Arrays.asList("a","b","c","d","e","x","y","z"));
        ArrayList<String> OtherList=new ArrayList<>(Arrays.asList(")",",",";","(",";","}","{","?","."));
        ArrayList<String> NumericList=new ArrayList<>(Arrays.asList("1","2","0","3","4","5","6","7","8","9"));
        
        ArrayList<String> StringList = new ArrayList<>();
        ArrayList<String> KeyList1=new ArrayList<>();
        ArrayList<String> OprList1=new ArrayList<>();
        ArrayList<String> IdntList1=new ArrayList<>();
        ArrayList<String> OtherList1=new ArrayList<>();
        ArrayList<String> NumericList1=new ArrayList<>();
        
        
        try {
            Scanner scan= new Scanner(new File("E:\\Numbers.txt"));
            while(scan.hasNextLine()){
            	
                String string= scan.nextLine();
                
                String[] temp= string.split(" ");
                
                for(String word : temp){
                    StringList.add(word);
               } 
            }
            scan.close();
        } catch (Exception ex) {
            System.out.println("File not found!");
        }
        
        for(int I=0;I<StringList.size();I++){
        	if(keyList.contains(StringList.get(I))) {
        		KeyList1.add(StringList.get(I));
        	}
        	else if(OprList.contains(StringList.get(I))) {
        		OprList1.add(StringList.get(I));
        	}
        	else if(IdntList.contains(StringList.get(I))) {
        		IdntList1.add(StringList.get(I));
        	}
        	else if(OtherList.contains(StringList.get(I))) {
        		OtherList1.add(StringList.get(I));
        	}
        	else if(NumericList.contains(StringList.get(I))) {
        		NumericList1.add(StringList.get(I));
        	}
        }
        
        Iterator<String> itr=KeyList1.iterator();
        System.out.println("keywords:");
        while(itr.hasNext()) {
        	System.out.print(itr.next()+" ");
        }
        System.out.println();
        
        itr=OprList1.iterator();
        System.out.println("Operators:");
        while(itr.hasNext()) {
        	System.out.print(itr.next()+" ");
        }
        System.out.println();
        
        itr=IdntList1.iterator();
        System.out.println("Identifiers:");
        while(itr.hasNext()) {
        	System.out.print(itr.next()+" ");
        }
        System.out.println();
        
        itr=OtherList1.iterator();
        System.out.println("Others:");
        while(itr.hasNext()) {
        	System.out.print(itr.next()+" ");
        }
        System.out.println();
        
        itr=NumericList1.iterator();
        System.out.println("Numeric Values:");
        while(itr.hasNext()) {
        	System.out.print(itr.next()+" ");
        }
    }
    
}


