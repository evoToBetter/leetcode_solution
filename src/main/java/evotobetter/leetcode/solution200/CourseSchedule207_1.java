package evotobetter.leetcode.solution200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CourseSchedule207_1 implements CourseSchedule207{
    // no circle in graph
    @Override
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<int[]>[] adjacentEdgesList=buildAdjacentEdgesList(numCourses,prerequisites);
        boolean hasCircle=checkCircle(adjacentEdgesList);
        return !hasCircle;
    }

    private List<int[]>[] buildAdjacentEdgesList(int numCourses, int[][] prerequisites){
        List<int[]>[] adjacentEdgesList =new List[numCourses];
        for(int[] prerequisit:prerequisites){
            List<int[]> adjacentEdges= adjacentEdgesList[prerequisit[1]];
            if(adjacentEdges==null){
                adjacentEdges=new ArrayList<>();
                adjacentEdgesList[prerequisit[1]]=adjacentEdges;
            }
            adjacentEdges.add(prerequisit);
        }
        return adjacentEdgesList;
    }

    private boolean checkCircle(List<int[]>[] adjacentEdgesList){
        Set<Integer> visited= new HashSet<>();
        for(int i=0; i<adjacentEdgesList.length;i++){
            visited.add(i);
            int visitNum=0;
            int limitNum=i;
            List<int[]> adjacentEdges=adjacentEdgesList[i];
            if(adjacentEdges==null){
                visited.clear();
                continue;
            }
            for(int[] edge:adjacentEdges){
                int nextVertex=edge[0];
                if(nextVertex<i){
                    continue;
                }
                boolean checkResult=checkCircle(visited,visitNum,nextVertex,adjacentEdgesList,limitNum);
                if(checkResult){
                    return checkResult;
                }
                visited.remove(nextVertex);
            }
            visited.clear();
        }
        return false;
    }

    private boolean checkCircle(Set<Integer> visited, int visitNum, int pos, List<int[]>[] adjacentEdgesList, int limitNum){
        visitNum++;
        if(visitNum>=adjacentEdgesList.length){
            return false;
        }
        List<int[]> edges=adjacentEdgesList[pos];
        if(edges==null){
            return false;
        }
        visited.add(pos);
        for(int[] edge:edges){
            int nextPos=edge[0];
            if(visited.contains(nextPos)){
                return true;
            }
            if(nextPos<limitNum){
                continue;
            }
            boolean checkResult=checkCircle(visited,visitNum,nextPos,adjacentEdgesList,limitNum);
            if(checkResult){
                return checkResult;
            }
            visited.remove(nextPos);
        }
        return false;
    }
}
