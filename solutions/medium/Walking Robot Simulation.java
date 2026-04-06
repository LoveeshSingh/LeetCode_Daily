// Title: Walking Robot Simulation
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/walking-robot-simulation/

        for (int command : commands){
            if (command==-1){
                curr=(curr+1)%4;
            }
            else if (command==-2){
                curr=(curr-1+4)%4;
            }
            else{
                for (int i=0 ; i<command ; i++){
                    int X=x+drn[curr][0];
                }
                    int Y=y+drn[curr][1];
                    x=X;
                    if (set.contains(new ArrayList<>(Arrays.asList(X,Y)))) break;
            set.add(new ArrayList<>(Arrays.asList(obstacle[0],obstacle[1])));
        }
                    y=Y;
                ans=Math.max(ans,x*x+y*y);
            }
        }
        return ans;
    }
}
