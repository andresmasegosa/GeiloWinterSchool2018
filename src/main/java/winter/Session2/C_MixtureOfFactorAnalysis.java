/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements.  See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and limitations under the License.
 *
 */

package winter.Session2;

import eu.amidst.core.datastream.DataInstance;
import eu.amidst.core.datastream.DataStream;
import eu.amidst.core.io.DataStreamLoader;
import eu.amidst.latentvariablemodels.staticmodels.FactorAnalysis;
import eu.amidst.latentvariablemodels.staticmodels.MixtureOfFactorAnalysers;
import eu.amidst.latentvariablemodels.staticmodels.Model;

/**
 *  Session 2. Latent Variable Models
 * Created by andresmasegosa on 16/01/2018.
 */
public class C_MixtureOfFactorAnalysis {
    public static void main(String[] args) {
        //!!!!!!!! Add the code needed to load the data set !!!!!!!!!!!!!!
        //Load the data set
        DataStream<DataInstance> data = null;


        //!!!!!!!! Add the code needed to create a Mixture of Factor Analysers model !!!!!!!!!!!!!!
        //Define the model (internally the skeleton is fixed)
        Model model = null;

        //Print the skeleton of the model
        System.out.println(model.getDAG());

        //!!!!!!!! Add the code to learn the model
        //Learnt the parameters of the model

        //Print the learnt model
        System.out.println(model.getModel());

    }
}
