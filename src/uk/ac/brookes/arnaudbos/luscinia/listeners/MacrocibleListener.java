/*
 * Copyright (C) 2011 Arnaud Bos <arnaud.tlse@gmail.com>
 * 
 * This file is part of Luscinia.
 * 
 * Luscinia is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Luscinia is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Luscinia.  If not, see <http://www.gnu.org/licenses/>.
 */

package uk.ac.brookes.arnaudbos.luscinia.listeners;

import uk.ac.brookes.arnaudbos.luscinia.utils.Log;
import uk.ac.brookes.arnaudbos.luscinia.views.MacrocibleActivity;
import uk.ac.brookes.arnaudbos.luscinia.views.TransActivity;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * Events listener dedicated to the MacrocibleActivity
 * @author arnaudbos
 */
public class MacrocibleListener implements OnClickListener
{
	private MacrocibleActivity context;
	
	@Override
	public void onClick(View view)
	{
		Log.d("MacrocibleListener.onClick");
		// Get all the user inputs
		String m = context.getM();
		String t = context.getT();
		String v = context.getV();
		String e = context.getE();
		String d = context.getD();

		// One field at least must be filled
		if ((m == null || m.equals("")) &&
			(t == null || t.equals("")) &&
			(v == null || v.equals("")) &&
			(e == null || e.equals("")) &&
			(d == null || d.equals(""))
			)
		{
			Log.d("No field is filled");
			// Show the DIALOG_EMPTY_FIELD Alert
			context.showDialog(TransActivity.DIALOG_EMPTY_FIELD);
		}
		else
		{
			Log.d("Fields ready");
			// TODO: Save the document
			context.setFieldsDisabled();
		}
	}

	/**
	 * Set the listener's context
	 * @param context The context to set
	 */
	public void setContext(MacrocibleActivity context)
	{
		this.context = context;
	}
}
