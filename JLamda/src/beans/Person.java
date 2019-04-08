package beans;

public class Person {
    private Long id;
    private String name;
    private Long score;

    public Person(Long id, String name, Long score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getScore() {
        return score;
    }
}
