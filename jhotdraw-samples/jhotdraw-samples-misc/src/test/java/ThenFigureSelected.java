import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.draw.DefaultDrawingView;

import static org.assertj.core.api.Assertions.assertThat;

public class ThenFigureSelected extends Stage<ThenFigureSelected> {

    @ExpectedScenarioState
    public DefaultDrawingView defaultDrawingView;

    public ThenFigureSelected figure_is_selected() {
        assertThat(1).isEqualTo(defaultDrawingView.getSelectedFigures().size());
        return self();
    }
}