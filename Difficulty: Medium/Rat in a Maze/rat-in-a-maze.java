class Solution {
    static ArrayList<String>res;
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        res=new ArrayList<>();
        int row=maze.length;
        int col=maze[0].length;
        boolean v[][]=new boolean[row][col];
        DFS(0,0,maze,v,new StringBuilder(),'\0');
        return res;
    }
    static void DFS(int x, int y, int[][] maze, boolean[][] v,StringBuilder str,char dir) {
        int n = maze.length;
        int m = maze[0].length;

        if (x < 0 || x >= n || y < 0 || y >= m || maze[x][y] == 0 || v[x][y])
            return;
        if (x==n-1 && y==m-1) {
            if (dir != '\0') str.append(dir);
            res.add(str.toString());
            if (dir != '\0') str.deleteCharAt(str.length() - 1);
            return;
        }
        if(dir!='\0') str.append(dir);
        v[x][y] = true;
        
        DFS(x + 1, y, maze, v, str, 'D'); // Down
        DFS(x, y - 1, maze, v, str, 'L'); // Left
        DFS(x, y + 1, maze, v, str, 'R'); // Right
        DFS(x - 1, y, maze, v, str, 'U'); // Up

        v[x][y] = false; 
        if (dir != '\0') str.deleteCharAt(str.length() - 1);
    }
}