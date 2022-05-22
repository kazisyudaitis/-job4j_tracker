package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl, greaterThanOrEqualTo(0));
    }

    @Test
    public void whenComparatorCreaseName() {
        Comparator<Job> creaseName = new JobinCreaseByName();
        int rsl = creaseName.compare(
                new Job("Petr", 1),
                new Job("Ivan", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorJobDescByName() {
        Comparator<Job> creaseName = new JobDescByName();
        int rsl = creaseName.compare(
                new Job("Petr", 1),
                new Job("Ivan", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorJobDescByPriority() {
        Comparator<Job> creaseName = new JobDescByPriority();
        int rsl = creaseName.compare(
                new Job("Petr", 1),
                new Job("Ivan", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorJobInCreaseByPriority() {
        Comparator<Job> creaseName = new JobInCreaseByPriority();
        int rsl = creaseName.compare(
                new Job("Petr", 1),
                new Job("Ivan", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorJobinCreaseByNameAndJobDescByPriority() {
        Comparator<Job> creaseName = new JobInCreaseByPriority().thenComparing(new JobInCreaseByPriority());
        int rsl = creaseName.compare(
                new Job("Petr", 1),
                new Job("Ivan", 0)
        );
        assertThat(rsl, greaterThan(0));
    }
}