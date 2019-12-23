package com.codingapi.deeplearning.demo08.learn.activation;

import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * @author lorne
 * @date 2019-11-15
 * @description 激活函数
 */
public interface Activation {


    /**
     * 激活函数，用于正向传播
     *
     * @param x  x
     * @param w     W
     * @param b     b
     * @return
     */
    INDArray forward(INDArray x, INDArray w, INDArray b);


    /**
     * 激活函数的导数函数，用于反向传播
     * @param a
     * @return
     */
    INDArray derivative(INDArray a);


}