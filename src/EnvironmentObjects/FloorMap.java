package EnvironmentObjects;

/**
 * Created by randersson on 2015-01-07.
 */

public class FloorMap {
    char[][] currMap;
    int[] spawnPoint = {1, 2};


    public FloorMap() {
        currMap = new char[80][25];

        for (int i = 0; i < currMap.length; i++) {
            for (int j = 0; j < currMap[i].length; j++) {
                if((int)Math.sqrt((Math.pow(i-40, 2)+Math.pow(j-10,2)))==9){
                    currMap[i][j] = '#';
                }
                else {
                    currMap[i][j] = ' ';
                }
            }
        }
        currMap[spawnPoint[0]][spawnPoint[1]] = '$';
    }
    public char[][] getCurrMap(){
        return currMap;
    }
    
    public int[] getSpawnPoint() {
		return spawnPoint;
	}
    
    
}
