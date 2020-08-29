package evotobetter.leetcode.solution200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CourseSchedule207_2 implements CourseSchedule207{
    // color vertex
    @Override
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] adjacentEdgesList=buildAdjacentEdgesList(numCourses,prerequisites);
        boolean canColorAll=true;
        int[] colors=new int[numCourses];

        for(int i=0; i<numCourses; i++){
            if(colors[i]==0){
                canColorAll=dfs(i,adjacentEdgesList,colors);
                if(!canColorAll){
                    return false;
                }
            }
        }
        return true;
    }

    private List<Integer>[] buildAdjacentEdgesList(int numCourses, int[][] prerequisites){
        List<Integer>[] adjacentEdgesList =new List[numCourses];
        for(int[] prerequisit:prerequisites){
            List<Integer> adjacentEdges= adjacentEdgesList[prerequisit[0]];
            if(adjacentEdges==null){
                adjacentEdges=new ArrayList<>();
                adjacentEdgesList[prerequisit[0]]=adjacentEdges;
            }
            adjacentEdges.add(prerequisit[1]);
        }
        return adjacentEdgesList;
    }

    private boolean dfs(int pos, List<Integer>[] adjacentEdgesList, int[] colors){
        colors[pos]=1;
        List<Integer> edges=adjacentEdgesList[pos];
        if(edges==null){
            colors[pos]=2;
            return true;
        }
        for(Integer nextPos : edges){
            if(colors[nextPos]==0){
                boolean canColor=dfs(nextPos,adjacentEdgesList,colors);
                if(!canColor){
                    return false;
                }
            }else if(colors[nextPos]==1){
                return false;
            }
        }
        colors[pos]=2;
        return true;
    }

}
