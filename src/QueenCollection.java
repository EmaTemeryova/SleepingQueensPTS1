import java.util.Map;
import java.util.Optional;

public abstract class QueenCollection {

    abstract void addQueen(Queen queen);

    abstract Optional<Queen> removeQueen(SleepingQueenPosition position);

    abstract Map<Position, Queen> getQueens();
}