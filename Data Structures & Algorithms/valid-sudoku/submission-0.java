class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int row = board.length;
        int col = board[0].length;

        for(int i = 0 ; i < row ; i++){

            Set<Character> unique = new HashSet<>();
            for(int j = 0 ; j < col ; j++){
               if(board[i][j] == '.') continue;
               if(unique.contains(board[i][j])) return false;
               unique.add(board[i][j]);
            }
        }

        for(int j = 0 ; j < col ; j++){

            Set<Character> unique = new HashSet<>();
            for(int i = 0 ; i < row ; i++){
               if(board[i][j] == '.') continue;
               if(unique.contains(board[i][j])) return false;
               unique.add(board[i][j]);
            }
        }
    
        
        for(int k = 0 ; k < 9 ; k++){
            int boxR = k/3;
            int boxC = k%3;
            int startR = 3 * boxR;
            int startC = 3 * boxC;
            
            Set<Character> unique = new HashSet<>();

             for(int i = startR ; i < startR + 3 ; i++){ 
                    for(int j = startC ; j < startC + 3 ; j++ ){
                        if(board[i][j] == '.') continue;
                        if(unique.contains(board[i][j])) return false;
                        unique.add(board[i][j]);
                }
            }

        }
        
        return true;
    }
}