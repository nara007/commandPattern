package my.backend;

/**
 * Created by nara007 on 16/2/23.
 */
public interface Command {

    void execute();
    void unexecute();
}
