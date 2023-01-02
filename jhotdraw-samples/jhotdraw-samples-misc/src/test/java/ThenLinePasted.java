import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.draw.DefaultDrawingView;
import static org.assertj.core.api.Assertions.*;

public class ThenLinePasted extends Stage<ThenLinePasted> {

    @ExpectedScenarioState
    public DefaultDrawingView defaultDrawingView;

    public ThenLinePasted lineIsDeleted() {
        assertThat(0).isEqualTo(defaultDrawingView.getDrawing().getChildCount());
        return self();
    }
}