class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    Queue<int[]> q=new LinkedList<>();
                    q.add(new int[]{i,j});
                    grid[i][j]='0';


                    while(!q.isEmpty()){

                        int [] p=q.poll();
                        int r=p[0];
                        int c=p[1];

                        if(r>0 && grid[r-1][c]=='1'){
                            q.add(new int[]{r-1,c});
                            grid[r-1][c]='0';
                        }
                        if(r<grid.length-1 && grid[r+1][c]=='1'){
                            q.add(new int[]{r+1,c});
                            grid[r+1][c]='0';
                        }
                        if(c>0 && grid[r][c-1]=='1'){
                            q.add(new int[]{r,c-1});
                            grid[r][c-1]='0';
                        }
                        if(c<grid[0].length-1 && grid[r][c+1]=='1'){
                            q.add(new int[]{r,c+1});
                            grid[r][c+1]='0';
                        }
                    }
                }
            }
        }
        return count;
    }
}