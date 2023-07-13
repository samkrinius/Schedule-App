import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.dicoding.courseschedule.R
import com.dicoding.courseschedule.ui.home.HomeActivity
import org.junit.Before
import org.junit.Test

//TODO 15 : Write UI test to validate when user tap Add Course (+) Menu, the AddCourseActivity is displayed
class HomeActivityTest {
    @Before
    fun setup() {
        ActivityScenario.launch(HomeActivity::class.java)
    }

    @Test
    fun displayAddCourseActivity() {
        onView(withId(R.id.action_add)).perform(click())
        onView(withId(R.id.add_ed_courseName)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.spinner_day)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.ib_start_time)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.tv_start_time)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.add_tv_startTime)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.ib_end_time)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.tv_end_time)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        onView(withId(R.id.add_tv_endTime)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.ed_lecturer)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))

        onView(withId(R.id.ed_note)).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}