import java.util.ArrayList;
/**
 *Array & ArrayList Algorithms
 */
public class ArrayAlgorithms
{
    public static void main (String [] args){

        /**
         *Array: Swap two elements & if they're out of bounds, do nothing.
         */
        if (index1 >= 0 && index2 >= 0 && index1 <= list.length-1 && index2 <= list.length-1){
            int saved = elements[i];    
            elements[i] = elements[j];
            elements[j] = saved;
        }

        /**
         *ArrayList: Swap two elements 
         */
        public static void swap(ArrayList<String> list, int i, int j)
        {
        String temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    /**
     *Swap halves: swap first and second half of array // printing elements in array
     */
    int[] elements = {1, 4, 9, 7, 3, 2, 5, 11, 0, 9};
    for (int i = 0; i < elements.length / 2; i++){
        int saved = elements[i];
        elements[i] = elements[i + elements.length / 2];
        elements[i + elements.length / 2] = saved;
    }
    //cant directly print array elements so you need to use toString()
    System.out.println(Arrays.toString(elements));

    /**
     *inefficient way to Swap halves: 
     *When you run the code, you will find that there is a lot 
     *of movement in the array. Each call to remove(0) causes 
     *n - 1 elements to move, where n is the length of the array. 
     *If n is 100, then you move 99 elements 50 times, (almost 
     *5000 move operations). That's an inefficient way of swapping 
     *the first and second halves.
     */
   
    
    /**
     *More efficient way to Swap halves: 
     */
    
    int i=0;
    int half = list.size()/2;
    int halfToUse = half;
    while(i<half){
        Picture temp = list.get(i);
        list.set(i, list.get(halfToUse));
        list.set(halfToUse, temp);
        i++;
        halfToUse++;
    }
    
    
    /**
     *Sum of values in an arraylist
     */
    ArrayList<Picture> gallery = new ArrayList<Picture>();
    int sum = 0;
    for (Picture pic : gallery){
        sum = sum + pic.getWidth();
    }

    /**
     *Sum of values in one array row, check if empty.
     */ 
    int sum = 0;
    if(gallery.size() == 0){
        return 0; //return 0 because the return value has to be an int. 
    }
    for (int row = 0; row < matrix[r].length; row ++)
    {
        sum = sum + matrix[r][row];
    }
    return sum;

    /**
     *Finding Min/Max/Largest/Smallest element
     */

    ArrayList<Picture> gallery = new ArrayList<Picture>();
    Picture tallest = gallery.get(0);
    for (int i = 1; i < gallery.size(); i++){  //using classic for loop bc we want to go through all elements except first one. 
        Picture pic = gallery.get(i);
        if (pic.getHeight() > tallest.getHeight()) {
            tallest = pic;
        }
    }

    //gets the Rectangle with the largest area in ARRAY
    //If more than one Rectangle has the same areas, return the first.
    public Rectangle largest(){
        if (list.length == 0){
            return null;
        }
        Rectangle largest = list[0];
        double largestArea = 0;

        for (Rectangle r : list)
        {
            double height = r.getHeight();
            double width = r.getWidth();
            double area = width*height;
            if (area > largestArea){
                largestArea = area;
                largest = r;
            }
        }
        return largest;
    }

    //get max elem in an array, not arraylist. 
    int max = integers[0]; 
    for (int i = 1; i < integers.length; i++){
        int current = integers[i];
        if(current > max){
            max = current;
        }
    }
    return max;

    //using enhanced for loop (array)
    int largest = integers[0];
    for(int p : integers){
        if (p > largest){
            largest = p;
        }
    } 
    return largest;

    //get max value in 2D array
    int max = matrix[0][0];
    for (int row = 0; row < matrix.length; row ++)
    {
        for (int column = 0; column < matrix[0].length; column++)
        {
            if (max < matrix[row][column]){
                max = matrix[row][column];
            }
        }
    }
    return max;

    /**
     *get last element
     */  
    //for 2d array
    myArray[myArray.length-1][myArray[0].length-1];
    //for arraylist
    int lastIndex = zoo.size()-1;
    //for array
    int lastIndex = zoo.length - 1;

    /**
     *Count number of matches
     */       
    ArrayList<Picture> gallery = new ArrayList<Picture>();
    int count = 0;
    for (Picture pic : gallery){
        if (pic.getHeight() > pic.getWidth()){ //counting num paintings in portrait view.
            count++;
        }
    }

    /**
     *Count most repeated letter in string (SI)
     */          
    public static String mostRepeated(String w){
        String mostRepeated = “”;
        int mostCount = 0;
        for (int i = 0; i<w.length(); i++){
            String currentLetter = w.substring(i, i+1);
            int currentCount = 0;
            for(int j = 0; j < w.length(); j++){
                String compareLetter = w.substring(i, i+1);
                if (currentLetter.equals(compareLetter)){
                    currentCount++;
                }
            }
            if (currentCount > mostCount){
                mostCount = currentCount;
                mostRepeated = currentLetter;
            }
        }
        return mostRepeated and mostCount;

        /**
         *Find first match
         */    
        int i = 0;
        boolean found = false;
        while (!found && i < gallery.size()){
            Picture pic = gallery.get(i);
            if (pic.getHeight() > pic.getWidth())   //portrait orientation
            {
                found = true;   
            }
            else {
                i++;
            }
        }
        if (found)
        {
            gallery.get(i).draw();
        }

        /**
         *Find all matches
         */         
        //here we have two array lists: one with the original elements, 
        //and a new one which we will fill with our matches. 
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        ArrayList<Picture> matches = new ArrayList<Picture>();
        for (Picture pic : gallery)
        {
            if (pic.getHeight() > pic.getWidth())   // portrait orientation
            {
                matches.add(pic);
            }
        }

        /**
         *Adding separators
         */ 
        public String getFriends(String separator)
        {
        String separatedFriends = "";
        for (int i = 0; i < friends.size(); i++) //loop through all friends.
        {
            if (i > 0) //this case is when you're not looking at the very first friend
            { 
                separatedFriends = separatedFriends + separator + friends.get(i);
            } 
            else //this is the very first case where you just add friend's name, no separator. 
            {
                separatedFriends = separatedFriends + friends.get(i);
            }
        }
        return separatedFriends;

        /**
         *Inserting and Removing Array elements
         */ 
        size++; //increase size
        for (int i = size - 1; i > pos; i--) //loop to make room for the new element.
        {       //go backwards from lower index to higher index. 
            values[i] = values[i-1];
        }
        values[pos] = newValue; //insert new value at position pos. 

        /**
         *removing adjacent duplicates
         */ 
        public void removeAdjacentDuplicates()
        {
            // your code here
            String noDupes = words.get(0);
            int i=1;
            while(i<words.size()){
                String current = words.get(i);
                if(noDupes.equals(current)) words.remove(i);
                else{
                    noDupes=words.get(i);
                    i++;
                }
            }
        }

        /**
         *removing ALL duplicates
         */
        public void removeAllDuplicates()
        {
            // your code here
            String noDupes = " "+words.get(0)+" ";
            int i=1;
            while(i<words.size()){
                String current = words.get(i);
                if(noDupes.contains(" "+current+" ")) words.remove(i);
                else{
                    noDupes+=" "+current+" ";
                    i++;
                }
            }
        }

    } 
}

