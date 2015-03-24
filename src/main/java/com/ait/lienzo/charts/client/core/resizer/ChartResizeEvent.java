/*
   Copyright (c) 2014,2015 Ahome' Innovation Technologies. All rights reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   
   Author: Roger Martinez - Red Hat
 */

package com.ait.lienzo.charts.client.core.resizer;

import com.google.gwt.event.shared.GwtEvent;

public class ChartResizeEvent extends GwtEvent<ChartResizeEventHandler>
{
    public static Type<ChartResizeEventHandler> TYPE = new Type<ChartResizeEventHandler>();

    private double                              width;

    private double                              height;

    private boolean                             apply;

    public ChartResizeEvent(double width, double height, boolean apply)
    {
        this.width = width;
        this.height = height;
        this.apply = apply;
    }

    @Override
    public Type<ChartResizeEventHandler> getAssociatedType()
    {
        return TYPE;
    }

    @Override
    protected void dispatch(ChartResizeEventHandler handler)
    {
        handler.onChartResize(this);
    }

    public double getHeight()
    {
        return height;
    }

    public double getWidth()
    {
        return width;
    }

    public boolean isApply()
    {
        return apply;
    }
}