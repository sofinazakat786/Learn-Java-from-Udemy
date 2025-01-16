public class Game {

    public String details() {
        return "\nCourt length (feet): " + Regulation.COURT_LENGTH +
               "\nRim height (feet): " + Regulation.RIM_HEIGHT +
               "\nDistance from three-point arc: " + Regulation.THREE_POINT_DISTANCE +
               "\nPoints awarded beyond the three-point arc: " + Regulation.BEYOND_THREE_POINT_ARC +
               "\nPoints awarded inside the three-point arc: " + Regulation.INSIDE_THREE_POINT_ARC +
               "\nPoints awarded from a free throw: " + Regulation.FREE_THROW +
               "\nLength of each quarter (minutes): " + Regulation.QUARTER_LENGTH +
               "\nSeconds to attempt shot after gaining possession: " + Regulation.POSSESSION_TIME;
    }
}
