// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.implementation;

import com.azure.core.annotations.BodyParam;
import com.azure.core.annotations.DELETE;
import com.azure.core.annotations.ExpectedResponses;
import com.azure.core.annotations.GET;
import com.azure.core.annotations.HEAD;
import com.azure.core.annotations.HeaderParam;
import com.azure.core.annotations.Host;
import com.azure.core.annotations.HostParam;
import com.azure.core.annotations.PUT;
import com.azure.core.annotations.QueryParam;
import com.azure.core.annotations.UnexpectedResponseExceptionType;
import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.util.Base64Util;
import com.azure.core.util.Context;
import com.azure.storage.file.models.FileHTTPHeaders;
import com.azure.storage.file.models.FileRangeWriteType;
import com.azure.storage.file.models.FilesAbortCopyResponse;
import com.azure.storage.file.models.FilesCreateResponse;
import com.azure.storage.file.models.FilesDeleteResponse;
import com.azure.storage.file.models.FilesDownloadResponse;
import com.azure.storage.file.models.FilesForceCloseHandlesResponse;
import com.azure.storage.file.models.FilesGetPropertiesResponse;
import com.azure.storage.file.models.FilesGetRangeListResponse;
import com.azure.storage.file.models.FilesListHandlesResponse;
import com.azure.storage.file.models.FilesSetHTTPHeadersResponse;
import com.azure.storage.file.models.FilesSetMetadataResponse;
import com.azure.storage.file.models.FilesStartCopyResponse;
import com.azure.storage.file.models.FilesUploadRangeResponse;
import com.azure.storage.file.models.StorageErrorException;
import io.netty.buffer.ByteBuf;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Files.
 */
public final class FilesImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private FilesService service;

    /**
     * The service client containing this operation class.
     */
    private AzureFileStorageImpl client;

    /**
     * Initializes an instance of FilesImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public FilesImpl(AzureFileStorageImpl client) {
        this.service = RestProxy.create(FilesService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Files to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{url}")
    private interface FilesService {
        @PUT("{shareName}/{directory}/{fileName}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<FilesCreateResponse> create(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-content-length") long fileContentLength, @HeaderParam("x-ms-type") String fileTypeConstant, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-content-type") String fileContentType, @HeaderParam("x-ms-content-encoding") String fileContentEncoding, @HeaderParam("x-ms-content-language") String fileContentLanguage, @HeaderParam("x-ms-cache-control") String fileCacheControl, @HeaderParam("x-ms-content-md5") String fileContentMD5, @HeaderParam("x-ms-content-disposition") String fileContentDisposition, Context context);

        @GET("{shareName}/{directory}/{fileName}")
        @ExpectedResponses({200, 206})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<FilesDownloadResponse> download(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-range") String range, @HeaderParam("x-ms-range-get-content-md5") Boolean rangeGetContentMD5, Context context);

        @HEAD("{shareName}/{directory}/{fileName}")
        @ExpectedResponses({200})
        Mono<FilesGetPropertiesResponse> getProperties(@HostParam("url") String url, @QueryParam("sharesnapshot") String sharesnapshot, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, Context context);

        @DELETE("{shareName}/{directory}/{fileName}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<FilesDeleteResponse> delete(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, Context context);

        @PUT("{shareName}/{directory}/{fileName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<FilesSetHTTPHeadersResponse> setHTTPHeaders(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-content-length") Long fileContentLength, @QueryParam("comp") String comp, @HeaderParam("x-ms-content-type") String fileContentType, @HeaderParam("x-ms-content-encoding") String fileContentEncoding, @HeaderParam("x-ms-content-language") String fileContentLanguage, @HeaderParam("x-ms-cache-control") String fileCacheControl, @HeaderParam("x-ms-content-md5") String fileContentMD5, @HeaderParam("x-ms-content-disposition") String fileContentDisposition, Context context);

        @PUT("{shareName}/{directory}/{fileName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<FilesSetMetadataResponse> setMetadata(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-version") String version, @QueryParam("comp") String comp, Context context);

        @PUT("{shareName}/{directory}/{fileName}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<FilesUploadRangeResponse> uploadRange(@HostParam("url") String url, @BodyParam("application/octet-stream") Flux<ByteBuf> optionalbody, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-range") String range, @HeaderParam("x-ms-write") FileRangeWriteType fileRangeWrite, @HeaderParam("Content-Length") long contentLength, @HeaderParam("Content-MD5") String contentMD5, @HeaderParam("x-ms-version") String version, @QueryParam("comp") String comp, Context context);

        @GET("{shareName}/{directory}/{fileName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<FilesGetRangeListResponse> getRangeList(@HostParam("url") String url, @QueryParam("sharesnapshot") String sharesnapshot, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-range") String range, @QueryParam("comp") String comp, Context context);

        @PUT("{shareName}/{directory}/{fileName}")
        @ExpectedResponses({202})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<FilesStartCopyResponse> startCopy(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-version") String version, @HeaderParam("x-ms-meta-") Map<String, String> metadata, @HeaderParam("x-ms-copy-source") String copySource, Context context);

        @PUT("{shareName}/{directory}/{fileName}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<FilesAbortCopyResponse> abortCopy(@HostParam("url") String url, @QueryParam("copyid") String copyId, @QueryParam("timeout") Integer timeout, @HeaderParam("x-ms-copy-action") String copyActionAbortConstant, @HeaderParam("x-ms-version") String version, @QueryParam("comp") String comp, Context context);

        @GET("{shareName}/{directory}/{fileName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<FilesListHandlesResponse> listHandles(@HostParam("url") String url, @QueryParam("marker") String marker, @QueryParam("maxresults") Integer maxresults, @QueryParam("timeout") Integer timeout, @QueryParam("sharesnapshot") String sharesnapshot, @HeaderParam("x-ms-version") String version, @QueryParam("comp") String comp, Context context);

        @PUT("{shareName}/{directory}/{fileName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(StorageErrorException.class)
        Mono<FilesForceCloseHandlesResponse> forceCloseHandles(@HostParam("url") String url, @QueryParam("timeout") Integer timeout, @QueryParam("marker") String marker, @QueryParam("sharesnapshot") String sharesnapshot, @HeaderParam("x-ms-handle-id") String handleId, @HeaderParam("x-ms-version") String version, @QueryParam("comp") String comp, Context context);
    }

    /**
     * Creates a new file or replaces a file. Note it only initializes the file with no content.
     *
     * @param fileContentLength Specifies the maximum size for the file, up to 1 TB.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesCreateResponse> createWithRestResponseAsync(long fileContentLength, Context context) {
        final Integer timeout = null;
        final String fileTypeConstant = "file";
        final Map<String, String> metadata = null;
        final String fileContentType = null;
        final String fileContentEncoding = null;
        final String fileContentLanguage = null;
        final String fileCacheControl = null;
        final String fileContentDisposition = null;
        String fileContentMD5Converted = null;
        return service.create(this.client.url(), timeout, this.client.version(), fileContentLength, fileTypeConstant, metadata, fileContentType, fileContentEncoding, fileContentLanguage, fileCacheControl, fileContentMD5Converted, fileContentDisposition, context);
    }

    /**
     * Creates a new file or replaces a file. Note it only initializes the file with no content.
     *
     * @param fileContentLength Specifies the maximum size for the file, up to 1 TB.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param metadata A name-value pair to associate with a file storage object.
     * @param fileHTTPHeaders Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesCreateResponse> createWithRestResponseAsync(long fileContentLength, Integer timeout, Map<String, String> metadata, FileHTTPHeaders fileHTTPHeaders, Context context) {
        final String fileTypeConstant = "file";
        String fileContentType = null;
        if (fileHTTPHeaders != null) {
            fileContentType = fileHTTPHeaders.fileContentType();
        }
        String fileContentEncoding = null;
        if (fileHTTPHeaders != null) {
            fileContentEncoding = fileHTTPHeaders.fileContentEncoding();
        }
        String fileContentLanguage = null;
        if (fileHTTPHeaders != null) {
            fileContentLanguage = fileHTTPHeaders.fileContentLanguage();
        }
        String fileCacheControl = null;
        if (fileHTTPHeaders != null) {
            fileCacheControl = fileHTTPHeaders.fileCacheControl();
        }
        byte[] fileContentMD5 = null;
        if (fileHTTPHeaders != null) {
            fileContentMD5 = fileHTTPHeaders.fileContentMD5();
        }
        String fileContentDisposition = null;
        if (fileHTTPHeaders != null) {
            fileContentDisposition = fileHTTPHeaders.fileContentDisposition();
        }
        String fileContentMD5Converted = Base64Util.encodeToString(fileContentMD5);
        return service.create(this.client.url(), timeout, this.client.version(), fileContentLength, fileTypeConstant, metadata, fileContentType, fileContentEncoding, fileContentLanguage, fileCacheControl, fileContentMD5Converted, fileContentDisposition, context);
    }

    /**
     * Reads or downloads a file from the system, including its metadata and properties.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesDownloadResponse> downloadWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final String range = null;
        final Boolean rangeGetContentMD5 = null;
        return service.download(this.client.url(), timeout, this.client.version(), range, rangeGetContentMD5, context);
    }

    /**
     * Reads or downloads a file from the system, including its metadata and properties.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param range Return file data only from the specified byte range.
     * @param rangeGetContentMD5 When this header is set to true and specified together with the Range header, the service returns the MD5 hash for the range, as long as the range is less than or equal to 4 MB in size.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesDownloadResponse> downloadWithRestResponseAsync(Integer timeout, String range, Boolean rangeGetContentMD5, Context context) {
        return service.download(this.client.url(), timeout, this.client.version(), range, rangeGetContentMD5, context);
    }

    /**
     * Returns all user-defined metadata, standard HTTP properties, and system properties for the file. It does not return the content of the file.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesGetPropertiesResponse> getPropertiesWithRestResponseAsync(Context context) {
        final String sharesnapshot = null;
        final Integer timeout = null;
        return service.getProperties(this.client.url(), sharesnapshot, timeout, this.client.version(), context);
    }

    /**
     * Returns all user-defined metadata, standard HTTP properties, and system properties for the file. It does not return the content of the file.
     *
     * @param sharesnapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the share snapshot to query.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesGetPropertiesResponse> getPropertiesWithRestResponseAsync(String sharesnapshot, Integer timeout, Context context) {
        return service.getProperties(this.client.url(), sharesnapshot, timeout, this.client.version(), context);
    }

    /**
     * removes the file from the storage account.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesDeleteResponse> deleteWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        return service.delete(this.client.url(), timeout, this.client.version(), context);
    }

    /**
     * removes the file from the storage account.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesDeleteResponse> deleteWithRestResponseAsync(Integer timeout, Context context) {
        return service.delete(this.client.url(), timeout, this.client.version(), context);
    }

    /**
     * Sets HTTP headers on the file.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesSetHTTPHeadersResponse> setHTTPHeadersWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final Long fileContentLength = null;
        final String comp = "properties";
        final String fileContentType = null;
        final String fileContentEncoding = null;
        final String fileContentLanguage = null;
        final String fileCacheControl = null;
        final String fileContentDisposition = null;
        String fileContentMD5Converted = null;
        return service.setHTTPHeaders(this.client.url(), timeout, this.client.version(), fileContentLength, comp, fileContentType, fileContentEncoding, fileContentLanguage, fileCacheControl, fileContentMD5Converted, fileContentDisposition, context);
    }

    /**
     * Sets HTTP headers on the file.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param fileContentLength Resizes a file to the specified size. If the specified byte value is less than the current size of the file, then all ranges above the specified byte value are cleared.
     * @param fileHTTPHeaders Additional parameters for the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesSetHTTPHeadersResponse> setHTTPHeadersWithRestResponseAsync(Integer timeout, Long fileContentLength, FileHTTPHeaders fileHTTPHeaders, Context context) {
        final String comp = "properties";
        String fileContentType = null;
        if (fileHTTPHeaders != null) {
            fileContentType = fileHTTPHeaders.fileContentType();
        }
        String fileContentEncoding = null;
        if (fileHTTPHeaders != null) {
            fileContentEncoding = fileHTTPHeaders.fileContentEncoding();
        }
        String fileContentLanguage = null;
        if (fileHTTPHeaders != null) {
            fileContentLanguage = fileHTTPHeaders.fileContentLanguage();
        }
        String fileCacheControl = null;
        if (fileHTTPHeaders != null) {
            fileCacheControl = fileHTTPHeaders.fileCacheControl();
        }
        byte[] fileContentMD5 = null;
        if (fileHTTPHeaders != null) {
            fileContentMD5 = fileHTTPHeaders.fileContentMD5();
        }
        String fileContentDisposition = null;
        if (fileHTTPHeaders != null) {
            fileContentDisposition = fileHTTPHeaders.fileContentDisposition();
        }
        String fileContentMD5Converted = Base64Util.encodeToString(fileContentMD5);
        return service.setHTTPHeaders(this.client.url(), timeout, this.client.version(), fileContentLength, comp, fileContentType, fileContentEncoding, fileContentLanguage, fileCacheControl, fileContentMD5Converted, fileContentDisposition, context);
    }

    /**
     * Updates user-defined metadata for the specified file.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesSetMetadataResponse> setMetadataWithRestResponseAsync(Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        final String comp = "metadata";
        return service.setMetadata(this.client.url(), timeout, metadata, this.client.version(), comp, context);
    }

    /**
     * Updates user-defined metadata for the specified file.
     *
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param metadata A name-value pair to associate with a file storage object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesSetMetadataResponse> setMetadataWithRestResponseAsync(Integer timeout, Map<String, String> metadata, Context context) {
        final String comp = "metadata";
        return service.setMetadata(this.client.url(), timeout, metadata, this.client.version(), comp, context);
    }

    /**
     * Upload a range of bytes to a file.
     *
     * @param range Specifies the range of bytes to be written. Both the start and end of the range must be specified. For an update operation, the range can be up to 4 MB in size. For a clear operation, the range can be up to the value of the file's full size. The File service accepts only a single byte range for the Range and 'x-ms-range' headers, and the byte range must be specified in the following format: bytes=startByte-endByte.
     * @param fileRangeWrite Specify one of the following options: - Update: Writes the bytes specified by the request body into the specified range. The Range and Content-Length headers must match to perform the update. - Clear: Clears the specified range and releases the space used in storage for that range. To clear a range, set the Content-Length header to zero, and set the Range header to a value that indicates the range to clear, up to maximum file size. Possible values include: 'update', 'clear'.
     * @param contentLength Specifies the number of bytes being transmitted in the request body. When the x-ms-write header is set to clear, the value of this header must be set to zero.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesUploadRangeResponse> uploadRangeWithRestResponseAsync(String range, FileRangeWriteType fileRangeWrite, long contentLength, Context context) {
        final Flux<ByteBuf> optionalbody = null;
        final Integer timeout = null;
        final String comp = "range";
        String contentMD5Converted = null;
        return service.uploadRange(this.client.url(), optionalbody, timeout, range, fileRangeWrite, contentLength, contentMD5Converted, this.client.version(), comp, context);
    }

    /**
     * Upload a range of bytes to a file.
     *
     * @param range Specifies the range of bytes to be written. Both the start and end of the range must be specified. For an update operation, the range can be up to 4 MB in size. For a clear operation, the range can be up to the value of the file's full size. The File service accepts only a single byte range for the Range and 'x-ms-range' headers, and the byte range must be specified in the following format: bytes=startByte-endByte.
     * @param fileRangeWrite Specify one of the following options: - Update: Writes the bytes specified by the request body into the specified range. The Range and Content-Length headers must match to perform the update. - Clear: Clears the specified range and releases the space used in storage for that range. To clear a range, set the Content-Length header to zero, and set the Range header to a value that indicates the range to clear, up to maximum file size. Possible values include: 'update', 'clear'.
     * @param contentLength Specifies the number of bytes being transmitted in the request body. When the x-ms-write header is set to clear, the value of this header must be set to zero.
     * @param optionalbody Initial data.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param contentMD5 An MD5 hash of the content. This hash is used to verify the integrity of the data during transport. When the Content-MD5 header is specified, the File service compares the hash of the content that has arrived with the header value that was sent. If the two hashes do not match, the operation will fail with error code 400 (Bad Request).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesUploadRangeResponse> uploadRangeWithRestResponseAsync(String range, FileRangeWriteType fileRangeWrite, long contentLength, Flux<ByteBuf> optionalbody, Integer timeout, byte[] contentMD5, Context context) {
        final String comp = "range";
        String contentMD5Converted = Base64Util.encodeToString(contentMD5);
        return service.uploadRange(this.client.url(), optionalbody, timeout, range, fileRangeWrite, contentLength, contentMD5Converted, this.client.version(), comp, context);
    }

    /**
     * Returns the list of valid ranges for a file.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesGetRangeListResponse> getRangeListWithRestResponseAsync(Context context) {
        final String sharesnapshot = null;
        final Integer timeout = null;
        final String range = null;
        final String comp = "rangelist";
        return service.getRangeList(this.client.url(), sharesnapshot, timeout, this.client.version(), range, comp, context);
    }

    /**
     * Returns the list of valid ranges for a file.
     *
     * @param sharesnapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the share snapshot to query.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param range Specifies the range of bytes over which to list ranges, inclusively.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesGetRangeListResponse> getRangeListWithRestResponseAsync(String sharesnapshot, Integer timeout, String range, Context context) {
        final String comp = "rangelist";
        return service.getRangeList(this.client.url(), sharesnapshot, timeout, this.client.version(), range, comp, context);
    }

    /**
     * Copies a blob or file to a destination file within the storage account.
     *
     * @param copySource Specifies the URL of the source file or blob, up to 2 KB in length. To copy a file to another file within the same storage account, you may use Shared Key to authenticate the source file. If you are copying a file from another storage account, or if you are copying a blob from the same storage account or another storage account, then you must authenticate the source file or blob using a shared access signature. If the source is a public blob, no authentication is required to perform the copy operation. A file in a share snapshot can also be specified as a copy source.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesStartCopyResponse> startCopyWithRestResponseAsync(String copySource, Context context) {
        final Integer timeout = null;
        final Map<String, String> metadata = null;
        return service.startCopy(this.client.url(), timeout, this.client.version(), metadata, copySource, context);
    }

    /**
     * Copies a blob or file to a destination file within the storage account.
     *
     * @param copySource Specifies the URL of the source file or blob, up to 2 KB in length. To copy a file to another file within the same storage account, you may use Shared Key to authenticate the source file. If you are copying a file from another storage account, or if you are copying a blob from the same storage account or another storage account, then you must authenticate the source file or blob using a shared access signature. If the source is a public blob, no authentication is required to perform the copy operation. A file in a share snapshot can also be specified as a copy source.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param metadata A name-value pair to associate with a file storage object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesStartCopyResponse> startCopyWithRestResponseAsync(String copySource, Integer timeout, Map<String, String> metadata, Context context) {
        return service.startCopy(this.client.url(), timeout, this.client.version(), metadata, copySource, context);
    }

    /**
     * Aborts a pending Copy File operation, and leaves a destination file with zero length and full metadata.
     *
     * @param copyId The copy identifier provided in the x-ms-copy-id header of the original Copy File operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesAbortCopyResponse> abortCopyWithRestResponseAsync(String copyId, Context context) {
        final Integer timeout = null;
        final String copyActionAbortConstant = "abort";
        final String comp = "copy";
        return service.abortCopy(this.client.url(), copyId, timeout, copyActionAbortConstant, this.client.version(), comp, context);
    }

    /**
     * Aborts a pending Copy File operation, and leaves a destination file with zero length and full metadata.
     *
     * @param copyId The copy identifier provided in the x-ms-copy-id header of the original Copy File operation.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesAbortCopyResponse> abortCopyWithRestResponseAsync(String copyId, Integer timeout, Context context) {
        final String copyActionAbortConstant = "abort";
        final String comp = "copy";
        return service.abortCopy(this.client.url(), copyId, timeout, copyActionAbortConstant, this.client.version(), comp, context);
    }

    /**
     * Lists handles for file.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesListHandlesResponse> listHandlesWithRestResponseAsync(Context context) {
        final String marker = null;
        final Integer maxresults = null;
        final Integer timeout = null;
        final String sharesnapshot = null;
        final String comp = "listhandles";
        return service.listHandles(this.client.url(), marker, maxresults, timeout, sharesnapshot, this.client.version(), comp, context);
    }

    /**
     * Lists handles for file.
     *
     * @param marker A string value that identifies the portion of the list to be returned with the next list operation. The operation returns a marker value within the response body if the list returned was not complete. The marker value may then be used in a subsequent call to request the next set of list items. The marker value is opaque to the client.
     * @param maxresults Specifies the maximum number of entries to return. If the request does not specify maxresults, or specifies a value greater than 5,000, the server will return up to 5,000 items.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param sharesnapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the share snapshot to query.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesListHandlesResponse> listHandlesWithRestResponseAsync(String marker, Integer maxresults, Integer timeout, String sharesnapshot, Context context) {
        final String comp = "listhandles";
        return service.listHandles(this.client.url(), marker, maxresults, timeout, sharesnapshot, this.client.version(), comp, context);
    }

    /**
     * Closes all handles open for given file.
     *
     * @param handleId Specifies handle ID opened on the file or directory to be closed. Asterix (‘*’) is a wildcard that specifies all handles.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesForceCloseHandlesResponse> forceCloseHandlesWithRestResponseAsync(String handleId, Context context) {
        final Integer timeout = null;
        final String marker = null;
        final String sharesnapshot = null;
        final String comp = "forceclosehandles";
        return service.forceCloseHandles(this.client.url(), timeout, marker, sharesnapshot, handleId, this.client.version(), comp, context);
    }

    /**
     * Closes all handles open for given file.
     *
     * @param handleId Specifies handle ID opened on the file or directory to be closed. Asterix (‘*’) is a wildcard that specifies all handles.
     * @param timeout The timeout parameter is expressed in seconds. For more information, see &lt;a href="https://docs.microsoft.com/en-us/rest/api/storageservices/Setting-Timeouts-for-File-Service-Operations?redirectedfrom=MSDN"&gt;Setting Timeouts for File Service Operations.&lt;/a&gt;.
     * @param marker A string value that identifies the portion of the list to be returned with the next list operation. The operation returns a marker value within the response body if the list returned was not complete. The marker value may then be used in a subsequent call to request the next set of list items. The marker value is opaque to the client.
     * @param sharesnapshot The snapshot parameter is an opaque DateTime value that, when present, specifies the share snapshot to query.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    public Mono<FilesForceCloseHandlesResponse> forceCloseHandlesWithRestResponseAsync(String handleId, Integer timeout, String marker, String sharesnapshot, Context context) {
        final String comp = "forceclosehandles";
        return service.forceCloseHandles(this.client.url(), timeout, marker, sharesnapshot, handleId, this.client.version(), comp, context);
    }
}
