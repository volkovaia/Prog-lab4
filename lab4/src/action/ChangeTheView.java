package action;

public class ChangeTheView {
    public void Change(SeeInDifferentWays newSee){
        switch (newSee){
            case LookDown:{
                System.out.println("Потом посмотрел вниз на улицу");
                break;
            }
            case GazeIntoTheTwilight:{
                System.out.println("и стал вглядываться в сумерки");
                break;
            }
            case FollowedWithInterest:{
                System.out.println("с интересом следил за ними");
                break;
            }
            default:{
                System.out.println("просто смотерл");
            }
        }
    }
}
