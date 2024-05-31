package other.activity

import com.android.tools.idea.wizard.template.ModuleTemplateData
import other.ArmsPluginTemplateProviderImpl

/**
 *
 * olamet的Activity AndroidManifest文件生成方法
 * 创建人 zhengwenkai
 * 创建日期 2024/5/31 01:17
 * 描述 BaseActivityManifest
 *
 */
fun baseActivityManifest(providerImpl: ArmsPluginTemplateProviderImpl) = """
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="${providerImpl.appPackageName.value}">
   <application>
${
    """
        <activity
	        android:name="${providerImpl.activityPackageName.value}.${providerImpl.pageName.value}Activity"
            android:screenOrientation="portrait"
	        />
    """
}
   </application>
</manifest>
"""