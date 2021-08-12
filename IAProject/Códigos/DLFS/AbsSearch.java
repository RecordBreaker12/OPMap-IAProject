package dlfs;

public abstract class AbsSearch {
   No startNode;
   No goalNode;

   public AbsSearch(No startNode, No goalNode){
       this.startNode = startNode;
       this.goalNode = goalNode;
   }

   public abstract boolean execute();
}
