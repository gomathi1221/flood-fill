class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int startcolor=image[sr][sc];
        if(startcolor==color){
            return image;

        }
       
        fill(image,sr,sc,color,startcolor);
        return image;
        
    }
    public void fill(int[][] image,int sr,int sc,int color,int startcolor){
        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=startcolor){
         return;
        }
        image[sr][sc]=color;
        fill(image,sr-1,sc,color,startcolor);
        fill(image,sr+1,sc,color,startcolor);
        fill(image,sr,sc-1,color,startcolor);
        fill(image,sr,sc+1,color,startcolor);
    }
}