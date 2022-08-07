package pro.kensait.designpattern.lesson10.state.provider;

public class Business {
    private DocumentFlow documentFlow;

    //
    public void createDocument() {
        System.out.println("[ Business#createDocument ]");

        DocumentFlow documentFlow =
                new DocumentFlow(1, new UnderConstractionState());

        // 本来はRDBに保存するが、ここでは便宜上フィールドにセットする
        this.documentFlow = documentFlow;
    }

    public void applyDocument() {
        System.out.println("[ Business#applyDocument ]");

        // 本来はRDBから取得するが、ここでは便宜上フィールドから取得する
        State nowState = documentFlow.getState();

        // 状態を変える
        State newState = nowState.doAction("apply");

        // 本来はRDBに保存するが、ここでは便宜上フィールドにセットする
        this.documentFlow.setState(newState);
    }

    public void approveDocument() {
        System.out.println("[ Business#approveDocument ]");

        // 本来はRDBから取得するが、ここでは便宜上フィールドから取得する
        State nowState = documentFlow.getState();

        // 状態を変える
        State newState = nowState.doAction("approve");

        // 本来はRDBに保存するが、ここでは便宜上フィールドにセットする
        this.documentFlow.setState(newState);
    }

    public void rejectDocument() {
        System.out.println("[ Business#rejectDocument ]");

        // 本来はRDBから取得するが、ここでは便宜上フィールドから取得する
        State nowState = documentFlow.getState();

        // 状態を変える
        State newState = nowState.doAction("reject");

        // 本来はRDBに保存するが、ここでは便宜上フィールドにセットする
        this.documentFlow.setState(newState);
    }
}