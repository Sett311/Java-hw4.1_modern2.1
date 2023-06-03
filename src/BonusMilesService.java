public class BonusMilesService {
    public int calculate(int cost) {
        return cost > 1000 ? cost / 100 : 0;
    }
}
