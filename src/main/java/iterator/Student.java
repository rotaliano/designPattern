package iterator;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Student {
    private String name;
    private int sex; //男の子:1  女の子:2
}
