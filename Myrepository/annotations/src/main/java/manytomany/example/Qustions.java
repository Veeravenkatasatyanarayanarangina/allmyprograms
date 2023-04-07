package manytomany.example;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ques1123")
public class Qustions
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
    private String qname;

    @ManyToMany(targetEntity = Answers.class,cascade = {CascadeType.ALL})
   @JoinTable(name = "q_ans1123",joinColumns = {@JoinColumn(name = "q_id")},
   inverseJoinColumns = {@JoinColumn(name="ans_id")})
    private List<Answers> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }
}
