package me.xujichang.lib.permissions;

/**
 * me.xujichang.lib.permissions in Permissions
 * description:
 * <p>
 * created by xujichang at 2020/4/28 6:28 PM
 */
@Deprecated
public interface IPermissionRequest {

    int requestCode();

    void onResult(boolean success);

}
