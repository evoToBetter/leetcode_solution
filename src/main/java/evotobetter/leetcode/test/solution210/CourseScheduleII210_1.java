package evotobetter.leetcode.test.solution210;

import java.util.ArrayList;
import java.util.List;

public class CourseScheduleII210_1 implements CourseScheduleII210{

    private List<Integer>[] adjacents;

    @Override
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        buildAdjacent(numCourses,prerequisites);
        List<Integer> coursesOrder=new ArrayList<>();
        int[] result= new int[numCourses];
        int[] colors=new int[numCourses];
        for(int i=0; i<numCourses; i++){
            if(colors[i]==0){
                boolean finish=canFinish(i,colors,coursesOrder);
                if(!finish){
                    return new int[0];
                }
            }
        }
        for(int i=0; i<numCourses;i++){
            result[i]=coursesOrder.get(i);
        }
        return result;
    }

    // reverse adjacent graph
    private void buildAdjacent(int numCourses, int[][] prerequisites){
        adjacents=new List[numCourses];
        for(int[] prerequisite: prerequisites){
            List<Integer>adjacent=adjacents[prerequisite[0]];
            if(adjacent==null){
                adjacent=new ArrayList<>();
                adjacents[prerequisite[0]]=adjacent;
            }
            adjacent.add(prerequisite[1]);
        }
    }

    // DFS find the deepest prerequisite
    private boolean canFinish(int pos, int[] colors, List<Integer> courseOrder){
        List<Integer> adjacent=adjacents[pos];
        colors[pos]=1;
        if(adjacent==null){
            courseOrder.add(0,pos);
            colors[pos]=2;
            return true;
        }
        for(int nextPos:adjacent){
            if(colors[nextPos]==0){
                boolean finish=canFinish(nextPos,colors,courseOrder);
                if(!finish){
                    return false;
                }
            }else if(colors[nextPos]==1){
                return false;
            }
        }
        courseOrder.add(pos);
        colors[pos]=2;
        return true;
    }
}
