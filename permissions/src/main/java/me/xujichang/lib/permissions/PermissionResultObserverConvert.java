package me.xujichang.lib.permissions;


import androidx.core.content.PermissionChecker;
import androidx.lifecycle.Observer;

public class PermissionResultObserverConvert implements Observer<PermissionResult> {
    private IPermissionRequest mRequest;

    public PermissionResultObserverConvert(IPermissionRequest pRequest) {
        mRequest = pRequest;
    }

    @Override
    public void onChanged(PermissionResult pResult) {
        switch (pResult.getType()) {
            case DENIED:
            case RATIONAL:
                mRequest.onResult(false);
                break;
            case ACCEPT:
            default:
                mRequest.onResult(true);
                break;
        }
    }
}
