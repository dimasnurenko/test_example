/*
 * Copyright 2014 Codenvy, S.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.codenvy.client.patch;

import com.codenvy.client.jsutils.Utils;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;

/**
 * @author Andrey Plotnikov
 */
public class Presenter3 {

    private final IsWidget view;

    @Inject
    public Presenter3(IsWidget view) {
        this.view = view;
    }

    public void go(AcceptsOneWidget container) {
        String host = Utils.getHost();

        container.setWidget(view);
    }

}