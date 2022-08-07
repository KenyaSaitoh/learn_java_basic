package pro.kensait.designpattern.lesson10.state.provider;

public class DocumentFlow {
    private Integer documentId;
    private State state;

    public DocumentFlow (Integer documentId, State state) {
        this.documentId = documentId;
        this.state = state;
    }

    public Integer getDocumentId() {
        return documentId;
    }

    public void setDocumentId(Integer documentId) {
        this.documentId = documentId;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}