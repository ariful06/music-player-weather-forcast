package com.javarank.magicapp.Calculator;

import com.fathzer.soft.javaluator.DoubleEvaluator;
import com.fathzer.soft.javaluator.Function;
import com.fathzer.soft.javaluator.Parameters;

import java.util.Iterator;

public class ExtendedDoubleEvaluator extends DoubleEvaluator {
    private static final Function SQRT = new Function("sqrt", 1);


    private static final Parameters PARAMS;

    static {
        PARAMS = DoubleEvaluator.getDefaultParameters();
        PARAMS.add(SQRT);

    }

    public ExtendedDoubleEvaluator() {
        super(PARAMS);
    }

    @Override
    public Double evaluate(Function function, Iterator<Double> arguments, Object evaluationContext) {
        if (function == SQRT) {
            return Math.sqrt(arguments.next());
        }

        else {
            return super.evaluate(function, arguments, evaluationContext);
        }
    }

}
