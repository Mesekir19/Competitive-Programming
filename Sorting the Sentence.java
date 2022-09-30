class Solution {
    public String sortSentence(String s) {
        String originalS="";
        String[] sentenceArr= s.split("\\s");
        String[] tempSentence= new String[sentenceArr.length];
        
        for(int i=0; i<sentenceArr.length; i++){
            int position = sentenceArr[i].charAt(sentenceArr[i].length()-1)-'0';
            tempSentence[position-1]=sentenceArr[i].substring(0,sentenceArr[i].length()-1);
            
        }
        for(String eachWord: tempSentence){
            originalS+=eachWord;
            originalS=originalS.concat(" ");
        }
        originalS=originalS.trim();
        return originalS;
    }
}
