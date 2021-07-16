package com.mycompany;

import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.reporters.SurefireReporter;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.List;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

public class RobustGherkinTest extends JUnitStories {

    // Here we specify the configuration, starting from default MostUsefulConfiguration, and changing only what is needed
    @Override
    public org.jbehave.core.configuration.Configuration configuration() {
        return new MostUsefulConfiguration()
                .useStoryParser(new org.jbehave.core.parsers.gherkin.GherkinStoryParser())
                .useStoryLoader(new LoadFromClasspath(this.getClass()))
                .useStoryReporterBuilder(new StoryReporterBuilder().withSurefireReporter(new SurefireReporter(getClass())));
    }

    // Here we specify the steps classes
    @Override
    public InjectableStepsFactory stepsFactory() {
        // varargs, can have more that one steps classes
        return new InstanceStepsFactory(configuration(), new RobustGherkinSteps());
    }

    @Override
    public List<String> storyPaths() {
        return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()), "**/*.feature", "");
    }
}