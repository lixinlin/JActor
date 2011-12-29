package org.agilewiki.jactor.stateMachine;

import org.agilewiki.jactor.ResponseProcessor;

final public class _SetF extends _Operation {
    private Func func;
    private String resultName;

    public _SetF(Func func, String resultName) {
        this.func = func;
        this.resultName = resultName;
    }

    @Override
    public void call(_SMBuilder smBuilder, ResponseProcessor rp) throws Exception {
        Object value = func.get();
        if (resultName != null) smBuilder.getState().results.put(resultName, value);
        rp.process(null);
    }
}
