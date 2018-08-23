package co.amdit.lithion;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.View;

public class BottomSheetDialog extends BottomSheetDialogFragment{
    @SuppressLint("RestrictedApi")
    @Override
    public void setupDialog(Dialog dialog, int style) {
        super.setupDialog(dialog, style);

        View content_view = View.inflate(getContext(),R.layout.bottom_sheet,null);
        dialog.setContentView(content_view);
    }
}
